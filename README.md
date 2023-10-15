# Банківська система

Цей проект є прикладом банківської системи, яка дозволяє створювати рахунки, здійснювати фінансові операції і обробляти різні типи помилок.

## Вимоги

Переконайтесь, що у вас встановлено наступне перед запуском проекту:

- Java SDK
- JUnit (для тестування)

## Використання

1. Спочатку вам потрібно створити екземпляр класу `Bank`:

```java
Bank bank = new Bank();
```
2. Додайте рахунок, вказавши ім'я клієнта та початковий депозит:
```java
BankAccount account1 = bank.createAccount("Alice", 1000);
```
3. Виконайте різні фінансові операції:
```java
account1.deposit(200);
account1.withdraw(100);
```
4. Знайдіть рахунок за номером:
```java
BankAccount foundAccount = bank.findAccount(account1.getAccountNumber());
```
5. Перекажіть гроші з одного рахунку на інший:
```java
bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 300);
```
6. Виведіть баланс рахунку:
```java
double balance = account1.getBalance();
System.out.println("Balance: " + balance);
```
## Обробка помилок
У проекті є обробка різних типів помилок, таких як:

`NegativeAmountException` - коли спробуєте внести або зняти гроші з від'ємною сумою.
`InsufficientFundsException` - коли недостатньо коштів для зняття.
`AccountNotFoundException` - коли рахунок не знайдено.

## Тести
Проект містить набір тестів для перевірки функціональності та обробки помилок. Ви можете запустити їх за допомогою JUnit.

## Автор
Автор: [Козачок Костянтин]



