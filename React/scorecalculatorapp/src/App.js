import logo from './logo.svg';
import './App.css';
import Timer from './components/timer';
import { CalculateScore } from './components/Caclculator';

function App() {
  return (
    <div className="App">
      {/* <CalculateScore Name={"Steve"}
      School={"DNY Public School"}
      total={284}
      goal={3}  
      /> */}

      <Timer/>
    </div>
  );
}

export default App;
