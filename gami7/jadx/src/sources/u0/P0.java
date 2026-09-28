package u0;

import j.AbstractC0755k;
import j.C0761q;
import j.C0762r;
import java.util.List;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0.k f10965a;

    /* renamed from: b, reason: collision with root package name */
    public final C0762r f10966b;

    public P0(A0.q qVar, C0761q c0761q) {
        this.f10965a = qVar.f72d;
        int[] iArr = AbstractC0755k.f8006a;
        this.f10966b = new C0762r();
        List h2 = A0.q.h(qVar, true, 4);
        int size = h2.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0.q qVar2 = (A0.q) h2.get(i2);
            if (c0761q.b(qVar2.f75g)) {
                this.f10966b.a(qVar2.f75g);
            }
        }
    }
}
