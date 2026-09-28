package K1;

import B.F;
import B1.C;
import D.e0;
import L2.w;
import android.database.Cursor;
import android.graphics.Typeface;
import android.util.Base64;
import g1.t;
import h1.C0697a;
import h1.C0698b;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import m.AbstractC0845s;
import m.B0;
import m.InterfaceC0818B;
import m.InterfaceC0846t;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import n2.AbstractC0974z;
import r1.v;

/* loaded from: classes.dex */
public final class i implements B0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4546h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4547i;

    /* renamed from: j, reason: collision with root package name */
    public Object f4548j;

    /* renamed from: k, reason: collision with root package name */
    public Object f4549k;

    /* renamed from: l, reason: collision with root package name */
    public Object f4550l;

    public i(r1.r rVar) {
        this.f4546h = 0;
        this.f4547i = rVar;
        this.f4548j = new b(rVar, 2);
        this.f4549k = new h(rVar, 0);
        this.f4550l = new h(rVar, 1);
    }

    @Override // m.z0
    public long b(AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        Iterator it = C.m0(0, abstractC0845s.b()).iterator();
        long j3 = 0;
        while (((E2.c) it).f1081j) {
            int a3 = ((AbstractC0974z) it).a();
            j3 = Math.max(j3, ((InterfaceC0846t) this.f4547i).get(a3).d(abstractC0845s.a(a3), abstractC0845s2.a(a3), abstractC0845s3.a(a3)));
        }
        return j3;
    }

    public g c(j jVar) {
        z2.h.f(jVar, "id");
        v a3 = v.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        String str = jVar.f4551a;
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        a3.t(jVar.f4552b, 2);
        r1.r rVar = (r1.r) this.f4547i;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            int j3 = AbstractC0962n.j(p3, "work_spec_id");
            int j4 = AbstractC0962n.j(p3, "generation");
            int j5 = AbstractC0962n.j(p3, "system_id");
            g gVar = null;
            String string = null;
            if (p3.moveToFirst()) {
                if (!p3.isNull(j3)) {
                    string = p3.getString(j3);
                }
                gVar = new g(p3.getInt(j4), p3.getInt(j5), string);
            }
            return gVar;
        } finally {
            p3.close();
            a3.c();
        }
    }

    public void d(g gVar) {
        r1.r rVar = (r1.r) this.f4547i;
        rVar.b();
        rVar.c();
        try {
            ((b) this.f4548j).g(gVar);
            rVar.o();
        } finally {
            rVar.j();
        }
    }

    @Override // m.z0
    public AbstractC0845s e(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        if (((AbstractC0845s) this.f4549k) == null) {
            this.f4549k = abstractC0845s3.c();
        }
        AbstractC0845s abstractC0845s4 = (AbstractC0845s) this.f4549k;
        if (abstractC0845s4 == null) {
            z2.h.j("velocityVector");
            throw null;
        }
        int b3 = abstractC0845s4.b();
        for (int i2 = 0; i2 < b3; i2++) {
            AbstractC0845s abstractC0845s5 = (AbstractC0845s) this.f4549k;
            if (abstractC0845s5 == null) {
                z2.h.j("velocityVector");
                throw null;
            }
            abstractC0845s5.e(((InterfaceC0846t) this.f4547i).get(i2).c(j3, abstractC0845s.a(i2), abstractC0845s2.a(i2), abstractC0845s3.a(i2)), i2);
        }
        AbstractC0845s abstractC0845s6 = (AbstractC0845s) this.f4549k;
        if (abstractC0845s6 != null) {
            return abstractC0845s6;
        }
        z2.h.j("velocityVector");
        throw null;
    }

    @Override // m.z0
    public AbstractC0845s g(long j3, AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        if (((AbstractC0845s) this.f4548j) == null) {
            this.f4548j = abstractC0845s.c();
        }
        AbstractC0845s abstractC0845s4 = (AbstractC0845s) this.f4548j;
        if (abstractC0845s4 == null) {
            z2.h.j("valueVector");
            throw null;
        }
        int b3 = abstractC0845s4.b();
        for (int i2 = 0; i2 < b3; i2++) {
            AbstractC0845s abstractC0845s5 = (AbstractC0845s) this.f4548j;
            if (abstractC0845s5 == null) {
                z2.h.j("valueVector");
                throw null;
            }
            abstractC0845s5.e(((InterfaceC0846t) this.f4547i).get(i2).b(j3, abstractC0845s.a(i2), abstractC0845s2.a(i2), abstractC0845s3.a(i2)), i2);
        }
        AbstractC0845s abstractC0845s6 = (AbstractC0845s) this.f4548j;
        if (abstractC0845s6 != null) {
            return abstractC0845s6;
        }
        z2.h.j("valueVector");
        throw null;
    }

    @Override // m.z0
    public AbstractC0845s k(AbstractC0845s abstractC0845s, AbstractC0845s abstractC0845s2, AbstractC0845s abstractC0845s3) {
        if (((AbstractC0845s) this.f4550l) == null) {
            this.f4550l = abstractC0845s3.c();
        }
        AbstractC0845s abstractC0845s4 = (AbstractC0845s) this.f4550l;
        if (abstractC0845s4 == null) {
            z2.h.j("endVelocityVector");
            throw null;
        }
        int b3 = abstractC0845s4.b();
        for (int i2 = 0; i2 < b3; i2++) {
            AbstractC0845s abstractC0845s5 = (AbstractC0845s) this.f4550l;
            if (abstractC0845s5 == null) {
                z2.h.j("endVelocityVector");
                throw null;
            }
            abstractC0845s5.e(((InterfaceC0846t) this.f4547i).get(i2).f(abstractC0845s.a(i2), abstractC0845s2.a(i2), abstractC0845s3.a(i2)), i2);
        }
        AbstractC0845s abstractC0845s6 = (AbstractC0845s) this.f4550l;
        if (abstractC0845s6 != null) {
            return abstractC0845s6;
        }
        z2.h.j("endVelocityVector");
        throw null;
    }

    public String toString() {
        switch (this.f4546h) {
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f4547i) + ", mProviderPackage: " + ((String) this.f4548j) + ", mQuery: " + ((String) this.f4549k) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f4550l;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
            default:
                return super.toString();
        }
    }

    public i(String str, String str2, String str3, List list) {
        this.f4546h = 2;
        str.getClass();
        this.f4547i = str;
        str2.getClass();
        this.f4548j = str2;
        this.f4549k = str3;
        list.getClass();
        this.f4550l = list;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
    }

    public i(Typeface typeface, C0698b c0698b) {
        int i2;
        int i3;
        this.f4546h = 3;
        this.f4550l = typeface;
        this.f4547i = c0698b;
        this.f4549k = new g1.s(1024);
        int a3 = c0698b.a(6);
        if (a3 != 0) {
            int i4 = a3 + c0698b.f7784h;
            i2 = ((ByteBuffer) c0698b.f7787k).getInt(((ByteBuffer) c0698b.f7787k).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        this.f4548j = new char[i2 * 2];
        int a4 = c0698b.a(6);
        if (a4 != 0) {
            int i5 = a4 + c0698b.f7784h;
            i3 = ((ByteBuffer) c0698b.f7787k).getInt(((ByteBuffer) c0698b.f7787k).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            t tVar = new t(this, i6);
            C0697a c3 = tVar.c();
            int a5 = c3.a(4);
            Character.toChars(a5 != 0 ? ((ByteBuffer) c3.f7787k).getInt(a5 + c3.f7784h) : 0, (char[]) this.f4548j, i6 * 2);
            if (tVar.b() > 0) {
                ((g1.s) this.f4549k).a(tVar, 0, tVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public i(w wVar, y2.f fVar, y2.f fVar2, e0 e0Var) {
        this.f4546h = 1;
        this.f4547i = wVar;
        this.f4548j = fVar;
        this.f4549k = fVar2;
        this.f4550l = e0Var;
    }

    public i(InterfaceC0846t interfaceC0846t) {
        this.f4546h = 4;
        this.f4547i = interfaceC0846t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC0818B interfaceC0818B) {
        this(new F(25, interfaceC0818B));
        this.f4546h = 4;
    }
}
