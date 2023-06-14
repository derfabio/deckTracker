import { Route, Routes } from "react-router-dom";
import Landing from "./Components/Landing";
import DecksPage from "./components/DecksPage";
import NewDecks from "./components/NewDecks";

export default function App() {
  return (
    <Routes>
      <Route path="/" element={<Landing />} />
      <Route path="/decks" element={<DecksPage />} />
      <Route path="/newdecks" element={<NewDecks />} />
    </Routes>
  );
}
