import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import './App.css';
import Navbar from './components/Navbar.jsx'
import Home from './pages/Home'
import Join from './pages/Join'

function App() {
  return (
    <div className="bg-[#0F1017] h-[655px]">
      <Navbar />
      <Router>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/login" element={<Join />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
