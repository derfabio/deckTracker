import { Route, Routes } from "react-router-dom";
import Landing from "./components/Landing";
import DecksPage from "./components/DecksPage";
import NewDecks from "./components/NewDecks";
import GetDeck from "./components/GetDeck";

export default function App() {
  return (
    <Routes>
      <Route path="/" element={<Landing />} />
      <Route path="/decks" element={<DecksPage />} />
      <Route path="/newdecks" element={<NewDecks />} />
      <Route path="/deck" element={<GetDeck />} />
    </Routes>
  );
}
