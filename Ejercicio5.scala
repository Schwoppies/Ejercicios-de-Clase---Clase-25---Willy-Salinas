case class Direccion(ciudad: String, pais: String)
case class Cliente(nombre: String, direccion: Direccion)

def ubicacion(cliente: Cliente): String = cliente match {
  case Cliente(_, Direccion(_, "Bolivia")) => "Cliente boliviano"
  case _ => "Cliente extranjero"
}