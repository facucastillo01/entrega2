SELECT 
    c.Nombre AS Nombre_Cliente,
    c.Apellido AS Apellido_Cliente,
    b.Marca AS Marca_Bicicleta,
    b.Modelo AS Modelo_Bicicleta,
    t.Descripcion AS Descripcion_Tipo_Bicicleta
FROM
    Clientes c
LEFT JOIN
    Bicicletas b ON c.Codigo_Bicicleta = b.Codigo
LEFT JOIN
    Tipos_Bicicletas t ON b.Tipo_Bicicleta = t.Codigo;
