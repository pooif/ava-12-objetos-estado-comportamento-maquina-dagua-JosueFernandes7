class MaquinaAguaConfiguravel {
  // Constantes
  final int capacidadeCopos200;
  final int capacidadeCopos300;
  final int capacidadeAgua;

  MaquinaAguaConfiguravel(int capacidadeAgua, int capacidadeCopos200, int capacidadeCopos300) {
    if(capacidadeAgua <= 0) throw new IllegalArgumentException("Capacidade de Água deve ser Positiva");
    if(capacidadeCopos200 <= 0) throw new IllegalArgumentException("Copos de 200mL deve ser positivo");
    if(capacidadeCopos300 <= 0) throw new IllegalArgumentException("Copos de 300mL deve ser positivo");


    this.capacidadeAgua = capacidadeAgua;
    this.capacidadeCopos200 = capacidadeCopos200;
    this.capacidadeCopos300 = capacidadeCopos300;
  }

  // Atributos
  private int copos200 = 0;
  private int copos300 = 0;
  private int quantidadeAgua = 0;

  // Métodos

  // Consulta

  int agua() {
    return quantidadeAgua;
  }
  int copos200() {
    return copos200;
  }
  int copos300() {
    return copos300;
  }

  // Estado (Abastecimento)
  void abastecerAgua() {
    quantidadeAgua = capacidadeAgua;
  }
  void abastecerCopo200() {
    copos200 = capacidadeCopos200;
  }
  void abastecerCopo300() {
    copos300 = capacidadeCopos300;
  }
  void servirCopo200() {
    if(copos200 > 0 && quantidadeAgua >= 200) {
      copos200--;
      quantidadeAgua -= 200;
    } else throw new IllegalStateException("Não há água");

  }
  void servirCopo300() {
    if(copos300 > 0 && quantidadeAgua >= 300) {
      copos300--;
      quantidadeAgua -= 300;
    } else throw new IllegalStateException("Não há água");

  }
}
