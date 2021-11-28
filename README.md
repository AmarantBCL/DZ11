# DZ11

- [x] 1. Создать класс **Person** который описывает человека, с полями: имя, фамилия, возраст, вес, рост.

Создать один или несколько конструкторов которые гарантирует что у каждого есть имя и фамилия.

Создать список из **100** обьектов типа **Person** заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).

Код который создает список **Person** и заполняет его данными разместить в другом классе, не в **Person**.

Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:

не было человека весом **3** кг и ростом **180** итд.

- [x] 2*. Написать класс для работы с матрицами (2-мерными массивами), методы:

- ```print(int[][] matrix)``` - печатает матрицу
- ```swapColumns(int[][] matrix, i, j)``` - меняет 2 столбца местами
- ```swapRows(int[][] matrix, i, j)``` - меняет 2 рядка местами
- ```mul(int[][] matrix, int value)``` - умножает матрицу на число
- ```toArray(int[][] matrix)``` - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12 элементов
- ```max(int[][] matrix)``` - возвращает максимальный элемент матрицы

## Примечания

- В задании 1 использованы свои собственные (примерные) формулы для расчёта веса/роста человека.

- В задании 2 методы замены рядков/столбцов принимают параметры начинающиеся с 1, а не с 0. Сделано для простоты восприятия человеком.