# Java Enterprise Core Lesson 4.

### Главная задача - Используя коллекции (list,set,map) написть API которое:

```sh
1. На старте программы читает данные с https://gist.githubusercontent.com/isicju/efcca7b7daf82f409f4c1d57aec291db/raw/3599979044aed64939e09b70b89eb7ad54d73748/users.txt
2. Создает нужные коллекции (как кэши) и затем выставляет http api с требованиями ниже
```

### Требование к API
```sh
1. Возвращает всех пользователей
2. Возвращает N первых пользователей
3. Возвращает всех пользователей по имени (полное совпадение)
4. Возвращает всех пользователей по имени или фамилии (содержит 3 вместестоящих символа в любой части имени или фамилии те по сути contains)
5. Возращает пользователя по уникальному ID
6. Возращает пользователя по дате рождения (с уточнением до дня)
7. Возращает всех пользователей старше чем заданная дата рождения
8. Возвращает всех пользователей рожденных в определенный месяц 
9. Возращает все email домены
```
# Уточнения

```sh
- Цель задания в том чтобы использовать наиболее оптимальные решения
- Над каждой функцией пропишите сложность её работы например O(N) итд
- То как будет выглядеть API а именно URL и или параметры к ней -  решайте сами
- Каждая API должна быть покрыта тестами.
```
## Чтобы сонар не жаловался на секьюрити, запускать его можно вот так через git bash (удалив все эти переменные из properties в мавене.)
mvn sonar:sonar -Dsonar.projectKey=PROJECT_NAME -Dsonar.projectName=PROJECT_NAME -Dsonar.host.url=URL -Dsonar.login=TOKEN