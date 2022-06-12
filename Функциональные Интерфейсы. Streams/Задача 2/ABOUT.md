Создайте функциональный интерфейс NumberGenerator, параметризованный таким образом, что принимает только наследников класса Number, имеющий метод boolean cond(T arg).

Создайте в методе public static NumberGenerator<? super Number> getGenerator() с помощью лямбда выражения реализацию NumberGenerator, которая возвращает true, если число в int эквиваленте больше 0.

Требования:
1. Должен быть метод public static NumberGenerator<? super Number> getGenerator()
2. Соблюдайте код стайл при параметризации.
3. Имя параметра должно быть "Т"
4. Метод должен возвращать корректную реализацию
