import Header from "./components/header";
import SalesCard from "./components/salesCard";

function App() {
  return (
    <>
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
