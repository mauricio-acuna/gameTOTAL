
# Prompt mejorado (versión completa)

**Rol:** Actúa como *Product Manager senior* y redacta un **PRD (Product Requirements Document)** impecable en **Markdown** para un producto web llamado **\[GAMETOTAL]**.

**Objetivo del producto:** Plataforma de comunidad gamer con blog y retos, cuyo **core** es un **portal de canjes** para localizar jugadores cercanos, intercambiar videojuegos (físicos y digitales) y facilitar **partidas online compartidas**.

**Ámbito y entregable:**

* Devuelve un único archivo **`prd.md`** claro, estructurado y accionable.
* Longitud objetivo: 10–18 secciones, con **Tabla de contenidos** enlazada.
* Escribe en **español de España** (neutral y profesional).

**Estructura obligatoria del PRD (en este orden):**

1. **Resumen ejecutivo** (visión, problema, propuesta de valor).
2. **Objetivos & KPIs** (p.ej., MAU, transacciones de canje/semana, tasa de match, retención D30).
3. **Alcance / No-alcance** (qué entra en el MVP vs. siguientes fases).
4. **Personas y segmentos** (p.ej., Consola, PC, retro, casual; edades; PEGI relevante).
5. **Mapa de journeys clave** (descubrir, publicar oferta, buscar cercanos, chatear, acordar canje, valorar, jugar online).
6. **Historias de usuario (INVEST)** con **Criterios de Aceptación** en estilo **Gherkin** (Given/When/Then) para:

   * Portal de canjes (crear/editar oferta, matching por ubicación, filtros por plataforma/PEGI/estado).
   * Localización y radio de búsqueda, privacidad y *opt-in*.
   * Mensajería y negociación, horarios y puntos de encuentro o envío.
   * Vinculación de cuentas de juego para **partidas online** (PSN/Xbox/Steam/Epic/…).
   * Sistema de reputación (ratings, reportes, verificación básica).
   * Blog de opiniones (consolas, PC, minijuegos) + **desafíos** y **trivias** como complementos.
7. **Requisitos funcionales** (matriz **MoSCoW** con “Must/Should/Could/Won’t”).
8. **Requisitos no funcionales** (rendimiento, escalabilidad, disponibilidad; **WCAG 2.2 AA**; logging/monitoring; **GDPR**; antifraude/antispam; moderación).
9. **Regulatorio & privacidad** (GDPR/LOPDGDD, consentimiento de ubicación, menores, PEGI).
10. **Métricas de calidad** (latencia p95 < 300 ms en búsquedas, 99.9% uptime, ≤0.5% fallos de canje).
11. **Arquitectura (alto nivel)**:

    * **Backend:** Java (**Spring Boot** recomendado).
    * **Frontend:** **Angular**.
    * **DB:** **PostgreSQL** (+ **Redis** para caché/colas).
    * **APIs REST** (autenticación **OAuth2/JWT**).
    * Incluir diagrama **Mermaid** (componentes y flujos principales).
12. **Modelo de datos (borrador)**: tablas/entidades mínimas (Users, Games, Platforms, Listings, Matches/Trades, Messages, Reviews, Sessions, Locations, Notifications, Challenges, BlogPosts/Comments).
13. **Integraciones** (mapa actual vs. futuras): login social, pasarela de envíos opcional, plataformas de juego (solo *linking* de perfiles públicos), analítica.
14. **Plan de lanzamiento**:

    * **Fase 1 (España)**: i18n ES, EUR, PEGI, distancias en km.
    * **Fase 2 (UE)** y **Fase 3 (global)**: i18n/en, husos horarios, impuestos/envíos locales.
15. **Roadmap** (MVP → MMP → V1.0) con hitos, dependencias y riesgos.
16. **Riesgos & mitigaciones** (seguridad, fraude de canje, falsos positivos en moderación, *liquidity problem* inicial).
17. **Aceptación & criterios de *Definition of Done*** por épica.
18. **Anexos**: glosario, referencias, *checklist* de accesibilidad, *test plan* de usabilidad.

**Detalles y estándares a respetar:**

* Estándares de la industria: RESTful, OpenAPI 3, CI/CD, 12-Factor, *feature flags*, Infra as Code, OWASP ASVS/Top 10, *rate limiting*, *content moderation pipeline*.
* **Seguridad:** hashing de credenciales, MFA opcional, protección CSRF/XSS/SQLi, revisión de dependencias.
* **Privacidad por diseño:** minimización de datos, *opt-in* de geolocalización, *privacy-preserving radius* (p.ej., celdas de 1 km), anonimización en logs.
* **Accesibilidad:** navegación teclado, contraste, descripciones, foco visible, errores con ayuda.
* **Medición:** eventos de analítica con nombres estandarizados (tabla de eventos incluida).
* **Contenido UGC:** políticas, reportes, *rate limits*, colas de moderación, lista de palabras sensibles.
* **Rendimiento:** caching en búsquedas de canjes, índices por plataforma/ubicación, paginación.

**Formato de salida:**

* Markdown con encabezados `#`, código para Mermaid cuando aplique, tablas para matrices MoSCoW y KPIs.
* Incluye ejemplos concretos (al menos 10 historias de usuario con Gherkin).
* No reveles tu razonamiento interno; devuelve únicamente el PRD final.

**Contexto regional inicial:**

* Lanzamiento en **España**, cumplimiento **GDPR/LOPDGDD**, divisa **EUR**, idiomas **es-ES** (v1) y **en** (v1.1), formatos de fecha **DD/MM/AAAA**.

**Criterio de calidad:** El PRD debe permitir a un equipo (PM, diseño, frontend Angular, backend Java, QA, DevOps) empezar el desarrollo sin depender de aclaraciones mayores.

---

# Prompt mejorado (versión compacta)

Redacta un **PRD en Markdown (`prd.md`)** para **\[NOMBRE DEL PRODUCTO]**, plataforma gamer cuyo **core** es un **portal de canjes** con **búsqueda por cercanía**, **intercambio de juegos** y **partidas online compartidas**. El blog de opiniones (consola/PC/minijuegos), desafíos y trivias son **complementos**.

Incluye: Resumen, KPIs, Personas, Journeys, Historias con **Gherkin**, Matriz **MoSCoW**, Requisitos no funcionales (WCAG 2.2 AA, seguridad OWASP, **GDPR**), Arquitectura (Java Spring Boot, Angular, PostgreSQL + Redis, OAuth2/JWT, OpenAPI), Modelo de datos, Integraciones, Plan España→global, Roadmap, Riesgos y *DoD*. Usa tablas, diagrama **Mermaid**, español de España, fechas DD/MM/AAAA, EUR. No muestres razonamiento interno; solo el PRD final listo para ejecutar.

---

# Plantilla parametrizable (rellena los corchetes)

**Instrucciones para el modelo:** Genera un **PRD** en **Markdown** para **\[NOMBRE DEL PRODUCTO]**. El **core** es **portal de canjes** (localizar jugadores cercanos, intercambiar juegos, compartir partidas online). Blog/retos/trivias = complementos.

**Tecnología & estándares:** Backend **Java (Spring Boot)**, Frontend **Angular**, DB **PostgreSQL** (+Redis), APIs REST con **OAuth2/JWT** y **OpenAPI 3**, CI/CD, 12-Factor, OWASP, WCAG 2.2 AA, GDPR.

**Estructura mínima obligatoria:**

* Resumen ejecutivo
* Objetivos & KPIs (p.ej., *tasa de match*, *canjes/semana*, *retención D30*)
* Personas & journeys
* Historias + **Criterios de Aceptación (Gherkin)**
* Requisitos funcionales (**MoSCoW**)
* Requisitos no funcionales (seguridad, rendimiento, accesibilidad, privacidad)
* Arquitectura (alto nivel + diagrama **Mermaid**)
* Modelo de datos (entidades: Users, Games, Platforms, Listings, Trades, Messages, Reviews, Locations, Notifications, Blog, Challenges)
* Plan de lanzamiento: **España** → **\[MERCADOS SIGUIENTES]**
* Roadmap (MVP/MMP/V1), riesgos, *Definition of Done*

**Formato de salida:** Un único archivo `prd.md` con tabla de contenidos, tablas y ejemplos. Español (ES). Fechas **DD/MM/AAAA**. Moneda **EUR**. No incluyas razonamiento interno.

---

## Tips rápidos (por si quieres afinar aún más)

* Sustituye **“canjes”** por **“intercambios”** si prefieres término más neutral en global.
* Añade **límites de radio** (p.ej., 1–50 km) y un **modo discreto** que oculte la ubicación exacta.
* Define **KPIs de liquidez** (ofertas activas por plataforma y por ciudad).
* Pide un **plan anti-fraude** (verificación por foto/código, reputación mínima para canjear).
* Incluye **método de resolución de disputas** y política de moderación UGC.
* Marca desde el PRD que **blog/retos/trivias** no bloquean el MVP del **portal de canjes**.

