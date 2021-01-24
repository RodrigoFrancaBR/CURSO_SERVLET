
<%
    String nomeEmpresa = (String) request.getAttribute("empresa");
    System.out.println(nomeEmpresa);
%>

<html>
<body>

	Empresa " +
	<% out.println(nomeEmpresa); %>
	+ " cadastrada com sucesso!

	</br> Empresa " +
	<%=(nomeEmpresa) %>
	+ " cadastrada com sucesso!

</body>
</html>