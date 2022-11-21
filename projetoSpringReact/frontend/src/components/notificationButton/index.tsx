import icon from '../../assets/img/notification-icon.svg'
import axios from "axios";
import {BASE_URL} from "../../utils/request";
import './styles.css'

type Props = {
  
 saleId: number; 
 
}

function handleClick(id){

 axios.get(`${BASE_URL}/sales/${id}/notification`)
 .then(response => {
  console.log("Enviado com sucesso")
 
 });
}



function NotificationButton({saleId} : Props) {

 return (
  <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
   <img src={icon} alt="Notificar" />
  </div>
 )
}

export default NotificationButton
