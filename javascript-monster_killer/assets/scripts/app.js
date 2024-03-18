const ATTACK_VALUE = 10;

let chosenMaxLife = 100;
let currentMonseterHealth = chosenMaxLife;
let currentPlayerHealth = chosenMaxLife;

adjustHealthBars(chosenMaxLife);

function attackHandler() {
  const damage = dealMonsterDamage(ATTACK_VALUE);
  currentMonseterHealth -= damage;
}

attackBtn.addEventListener('click', attackHandler);
