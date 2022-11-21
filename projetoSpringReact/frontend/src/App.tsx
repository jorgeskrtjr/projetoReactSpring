import Header from "./components/header";
import SalesCard from "./components/salesCard";
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';


function App() {
  return (
    <> 
       <ToastContainer></ToastContainer>
      <Header></Header>
      <main>
        <section id="sales">
          <div className="dsmeta-container"> 
           <SalesCard></SalesCard>   
           
          </div>
        </section>
      </main>
    </>
  );

}

export default App
