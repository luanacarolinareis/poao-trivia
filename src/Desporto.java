/**
 * Subclasse de 'Pergunta'
 */
class Desporto extends Pergunta {
    /**
     * Construtor default
     */
    Desporto() {}

    /**
     * Construtor
     * @param splitted Informação dividida
     */
    Desporto (String[] splitted) {
        super(splitted);
    }

    /**
     * Majoração da pontuação
     * @return Pontuação majorada em +3 pela área de "Desporto"
     */
    public int getScore() { return super.getScore() + 3; }
}
