-- 코드를 입력하세요
# FIRST_HALF (상반기 주문 정보)
# SHIPMENT_ID = 출하번호
# FLAVOR = 아이스크림 맛 PK
# TOTAL_ORDER = 총 주문량

# ICECREAM_INFO (아이스크림 성분)
# FLAVOR = 맛 PK FK
# INGREDITENT_TYPE = 성분

SELECT f.FLAVOR
FROM FIRST_HALF f
         LEFT JOIN ICECREAM_INFO i
                   on f.FLAVOR = i.FLAVOR
WHERE f.TOTAL_ORDER > 3000 AND i.INGREDIENT_TYPE like 'fruit_based'
ORDER BY f.TOTAL_ORDER DESC;