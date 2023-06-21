import { Link } from "react-router-dom";
import Deck from "./GetDeck";

export default function DecksPage() {
  return (
    <>
      <p>Deckspage</p>
      <Link to="/newdecks">Create a new deck</Link>
      <br />
      <br />
      <Deck />
      <br />
      <br />
      <Link to="/">Back to mainpage</Link>
    </>
  );
}
