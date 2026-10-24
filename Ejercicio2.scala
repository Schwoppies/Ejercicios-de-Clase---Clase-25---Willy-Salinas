def posicion(punto: (Int, Int)): String = punto match {
  case (0, 0) => "Origen"
  case (0, _) => "Eje Y"
  case (_, 0) => "Eje X"
  case _ => "Otro punto"
}