import { Link, useNavigate } from "react-router-dom";
import InputForm from "./InputForm";

export default function NewDecks() {
  const navigate = useNavigate();

  function handleClick() {
    console.log("Hello from the handleClick function! Back to Decks overview");
    navigate("/decks");
  } 

  return (
    <>
      <p>Create a new deck</p>
      <InputForm />
      <br />
      <br />
      <button type="button" onClick={handleClick}>
        Decks overview
      </button>
      <br />
      <Link to="/decks">Cancel</Link>
    </>
  );
}
