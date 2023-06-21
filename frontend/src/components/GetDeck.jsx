import { useState } from "react";

export default function GetDeck() {
  const [data, setData] = useState(null);

  function FetchDeck() {
    fetch("http://localhost:8080/api/decks/all", {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    })
      .then((response) => {
        if (!response.ok) {
          throw new Error("Request failed");
        }
        return response.json();
      })
      .then((response) => setData(response))
      .catch((error) => console.error("Error fetching decks:", error));
  }

  return (
    <>
      <button onClick={FetchDeck}>List all Decks</button>
      {data && (
        <div>
          <h3>Decks:</h3>
          {data.map((deck) => (
            <div key={deck.name}>{deck.name}</div>
          ))}
        </div>
      )}
    </>
  );
}
