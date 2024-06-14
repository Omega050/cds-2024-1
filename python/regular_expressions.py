import re

def novo_usuario():
    usuario = input('Insira o nome de usuário: ')
    tem_minuscula = re.search(r'[a-z]', usuario) is not None
    tem_numero = re.search(r'\d', usuario) is not None
    tem_caractere_especial = re.search(r'[\W_]', usuario) is not None
    if tem_minuscula and tem_numero and tem_caractere_especial:
        print('Usuario Valido')
    else: 
        print('Usuario Invalido')
        novo_usuario()

def nova_senha():
    senha = input('Insira a senha: ')
    tem_maiuscula = re.search(r'[a-z]', senha)is not None
    tem_minuscula = re.search(r'[a-z]', senha)is not None
    tem_numero = re.search(r'\d', senha)is not None
    tem_caractere_especial = re.search(r'[\W_]', senha)is not None 
    if tem_maiuscula and tem_numero and tem_caractere_especial:
        print('Senha Valida')
    else: 
        print('Senha Invalida')
        nova_senha()

def main():
    novo_usuario()
    nova_senha()


if __name__ == '__main__':
    main()  




