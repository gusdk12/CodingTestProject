-- MySQL
SELECT i.INGREDIENT_TYPE
    , SUM(f.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF f, ICECREAM_INFO i
WHERE f.FLAVOR = i.FLAVOR
GROUP BY i.INGREDIENT_TYPE
ORDER BY 2;

-- ANSI
SELECT i.INGREDIENT_TYPE
    , SUM(f.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF f LEFT JOIN ICECREAM_INFO i
    ON f.FLAVOR = i.FLAVOR
GROUP BY i.INGREDIENT_TYPE
ORDER BY 2;