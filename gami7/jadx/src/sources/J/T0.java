package J;

import M2.InterfaceC0344h;
import j.C0736B;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class T0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public C0736B f4092l;

    /* renamed from: m, reason: collision with root package name */
    public y2.c f4093m;

    /* renamed from: n, reason: collision with root package name */
    public L2.k f4094n;

    /* renamed from: o, reason: collision with root package name */
    public C1.q f4095o;

    /* renamed from: p, reason: collision with root package name */
    public Object f4096p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4097r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.a f4098s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(y2.a aVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4098s = aVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((T0) m((InterfaceC0344h) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        T0 t02 = new T0(this.f4098s, interfaceC1073d);
        t02.f4097r = obj;
        return t02;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c2 A[LOOP:0: B:17:0x00db->B:25:0x01c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163 A[EDGE_INSN: B:26:0x0163->B:27:0x0163 BREAK  A[LOOP:0: B:17:0x00db->B:25:0x01c2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0165 A[Catch: all -> 0x01a9, TRY_LEAVE, TryCatch #4 {all -> 0x01a9, blocks: (B:65:0x00e7, B:67:0x00fc, B:69:0x0108, B:71:0x0112, B:20:0x0154, B:23:0x015e, B:28:0x0165, B:34:0x017d, B:36:0x0186, B:76:0x0121, B:83:0x0135), top: B:64:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01a0 -> B:10:0x01a1). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.T0.p(java.lang.Object):java.lang.Object");
    }
}
