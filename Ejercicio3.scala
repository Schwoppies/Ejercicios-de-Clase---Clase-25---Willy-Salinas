case class Estudiante(nombre: String, nota: Double)

def resultado(estudiante: Estudiante): String = estudiante match {
  case e if e.nota >= 90 => "Excelente"
  case e if e.nota >= 70 => "Aprobado"
  case e if e.nota >= 51 => "Regular"
  case _ => "Reprobado"
}