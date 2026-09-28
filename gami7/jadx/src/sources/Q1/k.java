package Q1;

import B1.C0011a;
import B1.u;
import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import j.C0746b;
import j.C0747c;
import j.C0750f;
import java.util.ArrayList;
import java.util.Iterator;
import n2.AbstractC0946A;
import n2.AbstractC0948C;
import n2.AbstractC0962n;
import r1.v;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5292a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5293b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5294c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5295d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5296e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5297f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5298g;

    public k(r1.r rVar) {
        this.f5294c = new C1.b(9, false);
        this.f5292a = rVar;
        this.f5293b = new i(this, rVar);
        this.f5295d = new K1.p(rVar, 3);
        this.f5296e = new j(this, rVar);
        this.f5297f = new K1.h(rVar, 21);
        this.f5298g = new K1.h(rVar, 22);
    }

    public void a(C0750f c0750f) {
        C0747c c0747c = (C0747c) c0750f.keySet();
        C0750f c0750f2 = c0747c.f7991h;
        if (c0750f2.isEmpty()) {
            return;
        }
        if (c0750f.f7975j > 999) {
            C0750f c0750f3 = new C0750f(999);
            int i2 = c0750f.f7975j;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                c0750f3.put(c0750f.g(i3), null);
                i3++;
                i4++;
                if (i4 == 999) {
                    a(c0750f3);
                    c0750f.putAll(c0750f3);
                    c0750f3.clear();
                    i4 = 0;
                }
            }
            if (i4 > 0) {
                a(c0750f3);
                c0750f.putAll(c0750f3);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `id`,`name`,`phone`,`notes`,`active`,`orderIndex`,`useNameInTemplate`,`source` FROM `clients` WHERE `id` IN (");
        int i5 = c0750f2.f7975j;
        AbstractC0948C.e(sb, i5);
        sb.append(")");
        v a3 = v.a(sb.toString(), i5);
        Iterator it = c0747c.iterator();
        int i6 = 1;
        while (true) {
            C0746b c0746b = (C0746b) it;
            if (!c0746b.hasNext()) {
                break;
            }
            a3.p((String) c0746b.next(), i6);
            i6++;
        }
        Cursor p3 = AbstractC0946A.p((r1.r) this.f5292a, a3, false);
        try {
            int i7 = AbstractC0962n.i(p3, "id");
            if (i7 == -1) {
                return;
            }
            while (p3.moveToNext()) {
                String string = p3.getString(i7);
                if (c0750f.containsKey(string)) {
                    c0750f.put(string, new R1.b(p3.getString(0), p3.getString(1), p3.getString(2), p3.getString(3), p3.getInt(4) != 0, p3.getInt(5), p3.getInt(6) != 0, p3.getString(7)));
                }
            }
        } finally {
            p3.close();
        }
    }

    public k(Context context, C0011a c0011a, N1.b bVar, J1.a aVar, WorkDatabase workDatabase, K1.o oVar, ArrayList arrayList) {
        new u();
        this.f5292a = context.getApplicationContext();
        this.f5294c = bVar;
        this.f5293b = aVar;
        this.f5295d = c0011a;
        this.f5296e = workDatabase;
        this.f5297f = oVar;
        this.f5298g = arrayList;
    }
}
