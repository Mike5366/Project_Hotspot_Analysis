package cse511

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {
    if(queryRectangle.length == 0 || pointString.length == 0)
      return false

    val arrRect = queryRectangle.split(",")
    val arrPoint = pointString.split(",")

    val rectx1:Double = arrRect(0).toString.toDouble
    val rectx2:Double = arrRect(2).toString.toDouble
    val recty1:Double = arrRect(1).toString.toDouble
    val recty2:Double = arrRect(3).toString.toDouble
    val px:Double = arrPoint(0).toString.toDouble
    val py:Double = arrPoint(1).toString.toDouble

    //Check x
    if(rectx1 <= rectx2){
      if(px < rectx1 || px > rectx2)
        return false
    }
    else{
      if(px > rectx1 || px < rectx2)
        return false
    }

    //Check y
    if(recty1 <= recty2){
      if(py < recty1 || py > recty2)
        return false
    }
    else{
      if(py > recty1 || py < recty2)
        return false
    }

    return true
  }

  // YOU NEED TO CHANGE THIS PART

}
