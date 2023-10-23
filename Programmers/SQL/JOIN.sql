-- 상품 별 오프라인 매출 구하기
SELECT PRODUCT.PRODUCT_CODE, PRODUCT.PRICE * SUM(OFFLINE_SALE.SALES_AMOUNT) AS SALES
FROM PRODUCT, OFFLINE_SALE
WHERE PRODUCT.PRODUCT_ID = OFFLINE_SALE.PRODUCT_ID
GROUP BY PRODUCT.PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT.PRODUCT_CODE

-- 오랜 기간 보호한 동물 (1)
SELECT ANIMAL_INS.NAME, ANIMAL_INS.DATETIME
FROM ANIMAL_INS
LEFT JOIN ANIMAL_OUTS ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
WHERE ANIMAL_OUTS.ANIMAL_ID IS NULL
ORDER BY ANIMAL_INS.DATETIME
LIMIT 3

-- 없어진 기록 찾기
SELECT ANIMAL_OUTS.ANIMAL_ID, ANIMAL_OUTS.NAME
FROM ANIMAL_OUTS
LEFT JOIN ANIMAL_INS ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
WHERE ANIMAL_INS.NAME IS NULL AND ANIMAL_OUTS.NAME IS NOT NULL
ORDER BY ANIMAL_OUTS.ANIMAL_ID

-- 조건에 맞는 도서와 저자 리스트 출력하기
SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE, "%Y-%m-%d") AS PUBLISHED_DATE
FROM BOOK B, AUTHOR A
WHERE B.AUTHOR_ID = A.AUTHOR_ID AND B.CATEGORY = '경제'
ORDER BY B.PUBLISHED_DATE

-- 있었는데요 없었습니다
SELECT I.ANIMAL_ID, I.NAME
FROM ANIMAL_INS I, ANIMAL_OUTS O
WHERE I.ANIMAL_ID = O.ANIMAL_ID AND I.DATETIME > O.DATETIME
ORDER BY I.DATETIME

-- 보호소에서 중성화한 동물
SELECT I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
FROM ANIMAL_INS I, ANIMAL_OUTS O
WHERE I.ANIMAL_ID = O.ANIMAL_ID AND (I.SEX_UPON_INTAKE = 'Intact Male' OR I.SEX_UPON_INTAKE = 'Intact Female')
    AND (O.SEX_UPON_OUTCOME = 'Spayed Female' OR O.SEX_UPON_OUTCOME = 'Neutered Male') 
ORDER BY I.ANIMAL_ID
