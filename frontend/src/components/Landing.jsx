import { Link } from "react-router-dom";

export default function Landing() {
  return (
    <>
      <p>Welcome to Deck Tracker!</p>
      <Link to="/decks">Decks</Link>
    </>
  );
}
