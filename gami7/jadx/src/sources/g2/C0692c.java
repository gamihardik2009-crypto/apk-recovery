package g2;

import A0.v;
import B.y;
import G2.d;
import G2.f;
import G2.g;
import H.C0148m;
import J2.r;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import z2.h;
import z2.i;
import z2.s;

/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692c extends i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final C0692c f7775i = new C0692c(1);

    @Override // y2.c
    public final Object l(Object obj) {
        String str;
        g dVar;
        C0691b c0691b = (C0691b) obj;
        h.f(c0691b, "$this$open");
        s sVar = new s();
        List a3 = c0691b.a();
        if (a3 == null) {
            dVar = G2.b.f1248a;
        } else {
            sVar.f11909h = a3;
            c0691b.f7771a.getClass();
            List list = (List) sVar.f11909h;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = (String) it.next();
                if (linkedHashSet.contains(str)) {
                    break;
                }
                linkedHashSet.add(str);
            }
            if (str != null) {
                throw new r("header '" + str + "' is duplicated. please consider to use 'autoRenameDuplicateHeaders' option.");
            }
            Integer valueOf = Integer.valueOf(((List) sVar.f11909h).size());
            s sVar2 = new s();
            sVar2.f11909h = valueOf;
            y yVar = new y(23, c0691b);
            g fVar = new f(yVar, new v(yVar, 2), 0);
            if (!(fVar instanceof G2.a)) {
                fVar = new G2.a(fVar);
            }
            dVar = new d(new d(new f(fVar, new C0148m(sVar2, 11, c0691b), 1)), new C0690a(sVar, 0), 2);
        }
        return G2.i.k0(dVar);
    }
}
