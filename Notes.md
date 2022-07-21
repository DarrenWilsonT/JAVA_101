# Java笔记

## 常用类

### java.time.LocalDate

- `static LocalTime now()`

  构造一个表示当前日期的对象。

- `static LocalTime of(int year, int month, int day)`

  构造一个表示给定日期的对象。

- `int getYear()`

- `int getMonthValue()`

- `int getDayOfMonth()`

  得到当前日期的年、月和日。

- `DayOfWeek getDayOfWeek`

  得到当前日期是星期几，作为`DayOfWeek`类的一个实例返回。调用`getValue`来得到1~7之间的一个数，表示这是星期几，1表示星期一，7表示星期日。

- `LocalDate plusDays(int n)`

  生成当前日期之后n天的日期。

- `LocalDate minusDays(int n)`

  生成当前日期之前n天的日期。

## 方法参数

- 一个方法不能修改一个基本数据类型的参数（即数值型或布尔型）。
- 一个方法可以改变一个对象参数的状态。
- 一个方法不能让对象参数引用另一个新的对象。

## 初始化块

