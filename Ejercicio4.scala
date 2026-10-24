case class Inventario(producto: String, cantidad: Int)

def agregar(inventario: Inventario, cantidad: Int): Inventario = {
  inventario.copy(cantidad = inventario.cantidad + cantidad)
}