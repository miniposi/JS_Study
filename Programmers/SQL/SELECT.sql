-- 흉부외과 또는 일반외과 의사 목록 출력하기
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, "%Y-%m-%d") AS HIRE_YMD
  FROM DOCTOR
  WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC

-- 강원도에 위치한 생산공장 목록 출력하기
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS FROM FOOD_FACTORY
    WHERE  SUBSTRING(ADDRESS, 1, 3) = '강원도'
ORDER BY FACTORY_ID

-- 12세 이하인 여자 환자 목록 출력하기
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') AS TLNO
    FROM PATIENT
    WHERE AGE <= 12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME

-- 조건에 맞는 도서 리스트 출력하기
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, "%Y-%m-%d") AS PUBLISHED_DATE
FROM BOOK
WHERE CATEGORY = '인문' AND YEAR(PUBLISHED_DATE) = '2021'
ORDER BY PUBLISHED_DATE

-- 과일로 만든 아이스크림 고르기
SELECT F.FLAVOR
FROM FIRST_HALF F, ICECREAM_INFO I
WHERE F.TOTAL_ORDER > 3000 AND I.INGREDIENT_TYPE = 'fruit_based' AND F.FLAVOR = I.FLAVOR
ORDER BY F.TOTAL_ORDER DESC
