package u0;

import android.R;
import c1.C0610c;
import c1.C0615h;
import java.util.LinkedHashMap;

/* renamed from: u0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1272A {
    public static final void a(C0615h c0615h, A0.q qVar) {
        if (N.l(qVar)) {
            A0.x xVar = A0.j.f56w;
            A0.k kVar = qVar.f72d;
            A0.a aVar = (A0.a) B1.C.T(kVar, xVar);
            if (aVar != null) {
                c0615h.a(new C0610c(null, R.id.accessibilityActionPageUp, aVar.f16a, null));
            }
            A0.x xVar2 = A0.j.f58y;
            LinkedHashMap linkedHashMap = kVar.f60h;
            Object obj = linkedHashMap.get(xVar2);
            if (obj == null) {
                obj = null;
            }
            A0.a aVar2 = (A0.a) obj;
            if (aVar2 != null) {
                c0615h.a(new C0610c(null, R.id.accessibilityActionPageDown, aVar2.f16a, null));
            }
            Object obj2 = linkedHashMap.get(A0.j.f57x);
            if (obj2 == null) {
                obj2 = null;
            }
            A0.a aVar3 = (A0.a) obj2;
            if (aVar3 != null) {
                c0615h.a(new C0610c(null, R.id.accessibilityActionPageLeft, aVar3.f16a, null));
            }
            Object obj3 = linkedHashMap.get(A0.j.f59z);
            if (obj3 == null) {
                obj3 = null;
            }
            A0.a aVar4 = (A0.a) obj3;
            if (aVar4 != null) {
                c0615h.a(new C0610c(null, R.id.accessibilityActionPageRight, aVar4.f16a, null));
            }
        }
    }
}
