<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="css/bootstrap.min.css"/>
		<title>Insert title here</title>
	</head>
	<body>
	
		 <div class="container" style="margin-top: 30px">
            <div class="col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h1 class="panel-title"><strong>Bem-vindo(a) ao cadastro para novos administradores </strong></h1>
                    </div>
                    <div class="panel-body">
                        <form action="register" method="POST">
                        	<div class="form-group">
                                <label for="email">Nome</label>
                        		<input type="text" name="admin.name" class="form-control" placeholder="Nome Completo" required="required"/>
                        	</div>
                        	<div class="form-group">
                                <label for="email">Login</label>
                        		<input type="text" name="admin.login" class="form-control" placeholder="Cadastre um novo login" required="required"/>
                        	</div>
                            <div class="form-group">
                                <label for="email">E-mail</label>
                                <input type="email" name="admin.email" class="form-control" id="email" placeholder="E-mail" required="required"/>
                            </div>
                            <div class="form-group">
                                <label for="pwd">Senha <a href="/sessions/forgot_password">(esqueci a senha)</a></label>
                                <input type="password" class="form-control" id="pwd" placeholder="Digite uma senha" required="required"/>
                            </div>
                            <button type="submit" class="btn btn-sm btn-default">Cadastrar</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
		<!-- 
			<form 
				
				<input type="text" name="admin.login"/>
				<input type="text" name="admin.email"/>
				<input type="password" name="admin.password"/>
				<input type="submit" value="Cadastrar"/>
			</form>
		-->
	</body>
</html>