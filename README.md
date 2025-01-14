# Решение задания для спринта 8

## Пререквизиты для настройки reports-realm
 1. Установить локально proxyman.io
 2. Запустить docker compose
 3. Удалить текущий realm из Keycloak
 4. Перезапустить docker compose
 
 ## Проверка корректной работы кнопок
 1. Открыть клиентское приложение по адресу http://localhost.proxyman.io:3000/
 2. Под user1 нажать на кнопку "Download Report"
    - user1 получит ответ "Failed to call /reports. Error code: 403"
 3. Под prothetic1 нажать на кнопку "Download Report"
    - prothetic1 получит ответ "Response: 200 /reports: prothetic1"
 4. Под user1/prothetic1 нажать на кнопку "Get Data"
    - user1/prothetic1 получит ответ "Response: 200 /data"
 
 ## Проверка корректной работы wget
 - wget http://localhost.proxyman.io:8080/data возвращает 401 Unauthorized
 - wget http://localhost.proxyman.io:8080/info не требует авторизации для возвращения ответа