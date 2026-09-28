package K1;

import J.C0257c;
import J.C0274k0;
import J.W;
import android.database.Cursor;
import android.text.Spannable;
import android.text.SpannableString;
import g1.t;
import g1.u;
import g1.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import n2.AbstractC0946A;
import r0.InterfaceC1094H;
import r0.b0;
import r0.c0;
import r1.v;
import t0.C1236E;

/* loaded from: classes.dex */
public final class s implements g1.n, c0 {

    /* renamed from: h, reason: collision with root package name */
    public Object f4603h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4604i;

    public s(r1.r rVar) {
        this.f4603h = rVar;
        this.f4604i = new b(rVar, 6);
        new h(rVar, 19);
    }

    @Override // g1.n
    public Object a() {
        return (w) this.f4603h;
    }

    @Override // r0.c0
    public boolean b(Object obj, Object obj2) {
        v.w wVar = (v.w) this.f4603h;
        return z2.h.a(wVar.b(obj), wVar.b(obj2));
    }

    @Override // g1.n
    public boolean c(CharSequence charSequence, int i2, int i3, t tVar) {
        if ((tVar.f7761c & 4) > 0) {
            return true;
        }
        if (((w) this.f4603h) == null) {
            this.f4603h = new w(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C1.b) this.f4604i).getClass();
        ((w) this.f4603h).setSpan(new u(tVar), i2, i3, 33);
        return true;
    }

    @Override // r0.c0
    public void d(b0 b0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4604i;
        linkedHashMap.clear();
        Iterator it = b0Var.f9857h.iterator();
        while (it.hasNext()) {
            Object b3 = ((v.w) this.f4603h).b(it.next());
            Integer num = (Integer) linkedHashMap.get(b3);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b3, Integer.valueOf(intValue + 1));
            }
        }
    }

    public InterfaceC1094H e() {
        return (InterfaceC1094H) ((C0274k0) this.f4604i).getValue();
    }

    public ArrayList f(String str) {
        v a3 = v.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        r1.r rVar = (r1.r) this.f4603h;
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

    public void g(String str, Set set) {
        z2.h.f(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            r rVar = new r((String) it.next(), str);
            r1.r rVar2 = (r1.r) this.f4603h;
            rVar2.b();
            rVar2.c();
            try {
                ((b) this.f4604i).g(rVar);
                rVar2.o();
            } finally {
                rVar2.j();
            }
        }
    }

    public s(C1236E c1236e, InterfaceC1094H interfaceC1094H) {
        this.f4603h = c1236e;
        this.f4604i = C0257c.N(interfaceC1094H, W.f4109m);
    }

    public s(v.w wVar) {
        this.f4603h = wVar;
        this.f4604i = new LinkedHashMap();
    }

    public s() {
        this.f4603h = new LinkedHashMap();
        this.f4604i = new LinkedHashMap();
    }

    public s(w wVar, C1.b bVar) {
        this.f4603h = wVar;
        this.f4604i = bVar;
    }
}
