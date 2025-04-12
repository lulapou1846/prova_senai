Respostas:

a) Por que o uso de herança foi importante neste projeto?
No código original, a herança permitiu criar subclasses como `CamisetaSimples` e `CamisetaEstampada` a partir de uma classe base `Camiseta`. Isso evitou repetição de código e tornou possível especializar o comportamento do metodo `calcularDesconto()`. No entanto, nesta versão, a herança foi removida, e o comportamento foi centralizado dentro de uma única classe.

b) Como o polimorfismo foi aplicado e como isso torna o sistema mais flexível?
No código original, o polimorfismo foi aplicado ao sobrescrever `calcularDesconto()` nas subclasses, permitindo que cada tipo de camiseta tenha sua própria lógica de desconto. Isso tornou o sistema mais flexível ao permitir que novos tipos de camisetas fossem adicionados sem modificar a estrutura da classe base. Na versão atual, o polimorfismo não é explicitamente utilizado, mas a lógica condicional no metodo `calcularDesconto()` cumpre um papel similar ao diferenciar o desconto com base no tipo.
