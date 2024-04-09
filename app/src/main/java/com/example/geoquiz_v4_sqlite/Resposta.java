package com.example.geoquiz_v4_sqlite;

import java.util.UUID;

public class Resposta {
    private UUID mId;
    private boolean mRespostaCorreta;
    private boolean mRespostaApresentada;
    private boolean mColou;

    public Resposta(UUID id, boolean respostaCorreta, boolean respostaApresentada, boolean colou) {
        mId = id;
        mRespostaCorreta = respostaCorreta;
        mRespostaApresentada = respostaApresentada;
        mColou = colou;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public boolean isRespostaCorreta() {
        return mRespostaCorreta;
    }

    public void setRespostaCorreta(boolean respostaCorreta) {
        mRespostaCorreta = respostaCorreta;
    }

    public boolean isRespostaApresentada() {
        return mRespostaApresentada;
    }

    public void setRespostaApresentada(boolean respostaApresentada) {
        mRespostaApresentada = respostaApresentada;
    }

    public boolean isColou() {
        return mColou;
    }

    public void setColou(boolean colou) {
        mColou = colou;
    }
}