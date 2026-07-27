# Laboratorio I – Series de Tiempo

Análisis y pronóstico del ingreso mensual de viajeros internacionales a Guatemala entre enero de 2009 y junio de 2026.

## Integrantes

- Estuardo André Castro Bonifaz – 23890
- Juan Marcos Cruz Melara – 23110
- André Emilio Pivaral López – 23574

**Universidad del Valle de Guatemala**
Facultad de Ingeniería
Departamento de Computación
Data Science

**Catedrático:** Boris Fernando Becerra Peláez
**Sección:** 30

## Descripción

El proyecto describe el comportamiento histórico del turismo receptor, construye siete series mensuales agregadas por categoría, evalúa su estacionariedad y compara varios modelos de pronóstico sobre un conjunto de prueba. Como medida consistente en todo el periodo se emplea la suma de turistas y excursionistas para la serie total, ya que la categoría viajero excluye desde 2023 a los viajeros no turísticos de alta frecuencia. Las categorías de análisis seleccionadas son la vía de ingreso, con las series aérea, terrestre y marítima, y la región de residencia según la variable Región dos; con América del Centro, América del Norte y Europa.

## Estructura del proyecto

    Laboratorio1/
    ├── .venv/                    entorno virtual
    ├── data/
    │   ├── processed/            datasets generados por el notebook
    │   └── raw/
    │       └── Data.xlsx
    ├── figures/                  figuras exportadas para el informe
    ├── notebook/
    │   └── Laboratorio1.ipynb    entregable de código
    ├── .gitignore
    ├── Laboratorio 1.pdf         informe final
    └── README.md

## Requisitos

- Python; se utilizó la versión 3.12.0
- Paquetes: pandas, numpy, matplotlib, seaborn, scipy, statsmodels, scikit-learn, pmdarima, prophet, pyarrow, openpyxl, jupyter, ipykernel

## Contenido del análisis

- Análisis exploratorio del comportamiento temporal, los rankings de países, regiones, vías y fronteras, y la revisión de valores faltantes, duplicados y atípicos.
- Partición cronológica en setenta por ciento de entrenamiento y treinta por ciento de prueba, y construcción de las siete series mensuales.
- Análisis de estacionariedad en media y en varianza, transformaciones logarítmicas y prueba de Dickey-Fuller aumentada.
- Modelado con SARIMA, auto_arima, Prophet, Holt-Winters, suavizamiento exponencial simple y seasonal naive, con diagnóstico de residuos y criterios AIC y BIC.
- Predicción sobre el conjunto de prueba, comparación por error absoluto medio y raíz del error cuadrático medio, y análisis comparativo de estacionalidad, tendencia, volatilidad e impacto de la pandemia.
