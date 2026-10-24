case class Producto(nombre: String, precio: Double, stock: Int)

def clasificar(producto: Producto): String = producto match {
  case p if p.stock == 0 => "Sin stock"
  case p if p.precio >= 1000 => "Producto premium"
  case _ => "Producto estándar"
}