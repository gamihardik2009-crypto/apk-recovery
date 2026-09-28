package K0;

import C0.C0027j;
import C0.K;
import C0.o;
import C0.q;
import C0.v;
import C0.x;
import android.text.TextPaint;
import c0.AbstractC0598q;
import c0.C0575O;
import c0.InterfaceC0600s;
import e0.AbstractC0655e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f4527a = new k(false);

    public static final boolean a(K k3) {
        v vVar;
        x xVar = k3.f477c;
        C0027j c0027j = (xVar == null || (vVar = xVar.f559b) == null) ? null : new C0027j(vVar.f556b);
        boolean z3 = false;
        if (c0027j != null && c0027j.f513a == 1) {
            z3 = true;
        }
        return !z3;
    }

    public static final void b(o oVar, InterfaceC0600s interfaceC0600s, AbstractC0598q abstractC0598q, float f3, C0575O c0575o, N0.j jVar, AbstractC0655e abstractC0655e, int i2) {
        ArrayList arrayList = oVar.f530h;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList.get(i3);
            qVar.f533a.g(interfaceC0600s, abstractC0598q, f3, c0575o, jVar, abstractC0655e, i2);
            interfaceC0600s.q(0.0f, qVar.f533a.b());
        }
    }

    public static final void c(TextPaint textPaint, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f3 * 255));
    }
}
