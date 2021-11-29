Feature: Consulta disponibilidad del  servicio Time Zone

  Scenario: Consulta exitosa de servicio Time Zone con valores correctos
    Given Leonardo es un usuario que requiere consultar la api Time Zone
    When Leonardo  envia los parametros asociados
    Then Leonardo debe obtener un codigo de respuesta exitosa

