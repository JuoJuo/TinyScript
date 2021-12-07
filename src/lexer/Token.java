package lexer;

public class Token {
  public TokenType get_type() {
    return _type;
  }

  public Token(TokenType _type, String _value) {
    this._type = _type;
    this._value = _value;
  }

  public boolean isVariable() {
    return _type == TokenType.VARIABLE;
  }

  public boolean isScalar() {
    return _type == TokenType.STRING || _type == TokenType.FLOAT ||
      _type == TokenType.INTEGER || _type == TokenType.BOOLEAN;
  }

  @Override
  public String toString() {
    return String.format("type %s, value s%", _type, _value);
  }

  TokenType _type;
  String _value;
}
