package O1;

import B1.s;
import B1.t;
import C1.y;
import K1.g;
import K1.i;
import K1.l;
import K1.o;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import n2.AbstractC0946A;
import n2.AbstractC0961m;
import r1.r;
import r1.v;
import z2.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5158a;

    static {
        String f3 = s.f("DiagnosticsWrkr");
        h.e(f3, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f5158a = f3;
    }

    public static final String a(l lVar, K1.s sVar, i iVar, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            g c3 = iVar.c(y.v(oVar));
            Integer valueOf = c3 != null ? Integer.valueOf(c3.f4544c) : null;
            lVar.getClass();
            v a3 = v.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            String str = oVar.f4564a;
            if (str == null) {
                a3.n(1);
            } else {
                a3.p(str, 1);
            }
            r rVar = (r) lVar.f4556b;
            rVar.b();
            Cursor p3 = AbstractC0946A.p(rVar, a3, false);
            try {
                ArrayList arrayList2 = new ArrayList(p3.getCount());
                while (p3.moveToNext()) {
                    arrayList2.add(p3.isNull(0) ? null : p3.getString(0));
                }
                p3.close();
                a3.c();
                sb.append("\n" + str + "\t " + oVar.f4566c + "\t " + valueOf + "\t " + t.A(oVar.f4565b) + "\t " + AbstractC0961m.L(arrayList2, ",", null, null, null, 62) + "\t " + AbstractC0961m.L(sVar.f(str), ",", null, null, null, 62) + '\t');
            } catch (Throwable th) {
                p3.close();
                a3.c();
                throw th;
            }
        }
        String sb2 = sb.toString();
        h.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
