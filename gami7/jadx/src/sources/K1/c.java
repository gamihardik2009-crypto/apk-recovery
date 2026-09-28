package K1;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Trace;
import c1.C0615h;
import c1.C0616i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n2.AbstractC0946A;
import n2.AbstractC0961m;
import r1.v;
import u0.G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4532a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4533b;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f4532a = obj;
        this.f4533b = obj2;
    }

    public void a(int i2, C0615h c0615h, String str, Bundle bundle) {
        ((G) this.f4533b).c(i2, c0615h, str, bundle);
    }

    public boolean b(j jVar) {
        boolean containsKey;
        synchronized (this.f4532a) {
            containsKey = ((LinkedHashMap) this.f4533b).containsKey(jVar);
        }
        return containsKey;
    }

    public C0615h c(int i2) {
        G g3 = (G) this.f4533b;
        Trace.beginSection("createAccessibilityNodeInfo");
        try {
            C0615h b3 = G.b(g3, i2);
            if (g3.f10886p && i2 == g3.f10884n) {
                g3.f10885o = b3;
            }
            return b3;
        } finally {
            Trace.endSection();
        }
    }

    public C0615h d() {
        return c(((G) this.f4533b).f10884n);
    }

    public ArrayList e(String str) {
        v a3 = v.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        r1.r rVar = (r1.r) this.f4532a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            ArrayList arrayList = new ArrayList(p3.getCount());
            while (p3.moveToNext()) {
                arrayList.add(p3.isNull(0) ? null : p3.getString(0));
            }
            return arrayList;
        } finally {
            p3.close();
            a3.c();
        }
    }

    public boolean f(String str) {
        v a3 = v.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        r1.r rVar = (r1.r) this.f4532a;
        rVar.b();
        boolean z3 = false;
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            if (p3.moveToFirst()) {
                z3 = p3.getInt(0) != 0;
            }
            return z3;
        } finally {
            p3.close();
            a3.c();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0652, code lost:
    
        if (r0 != 16) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0767  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0177 -> B:77:0x0178). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r20, int r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.c.g(int, int, android.os.Bundle):boolean");
    }

    public C1.o h(j jVar) {
        C1.o oVar;
        z2.h.f(jVar, "id");
        synchronized (this.f4532a) {
            oVar = (C1.o) ((LinkedHashMap) this.f4533b).remove(jVar);
        }
        return oVar;
    }

    public List i(String str) {
        List X3;
        z2.h.f(str, "workSpecId");
        synchronized (this.f4532a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4533b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (z2.h.a(((j) entry.getKey()).f4551a, str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f4533b).remove((j) it.next());
                }
                X3 = AbstractC0961m.X(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return X3;
    }

    public C1.o j(j jVar) {
        C1.o oVar;
        synchronized (this.f4532a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4533b;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new C1.o(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                oVar = (C1.o) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public c(r1.r rVar) {
        this.f4532a = rVar;
        this.f4533b = new b(rVar, 0);
    }

    public c(int i2) {
        switch (i2) {
            case 4:
                this.f4532a = new C0616i(this);
                break;
            default:
                this.f4532a = new Object();
                this.f4533b = new LinkedHashMap();
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(G g3) {
        this(4);
        this.f4533b = g3;
    }
}
