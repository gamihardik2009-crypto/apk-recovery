package c;

import a.AbstractC0423a;
import java.io.Serializable;
import m2.C0880v;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0423a f7159a;

    public final void a(Serializable serializable) {
        C0880v c0880v;
        AbstractC0423a abstractC0423a = this.f7159a;
        if (abstractC0423a != null) {
            abstractC0423a.R(serializable);
            c0880v = C0880v.f8657a;
        } else {
            c0880v = null;
        }
        if (c0880v == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
