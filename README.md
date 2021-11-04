# leap-year

### Sette opp en ny workflow som kjører tester
```
Under "steps:" legger du til en run: command som du navngir med å ha "- name: A name"
over den. I run skriver du comanden som får din kode til å kjøre testene dine.
Gjør dette for maven:
- name: Run Tests
  run: mvn test
```
