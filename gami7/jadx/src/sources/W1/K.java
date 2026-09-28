package W1;

import J2.InterfaceC0328z;
import android.content.Context;
import android.net.Uri;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class K extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public Object f5938l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5939m;

    /* renamed from: n, reason: collision with root package name */
    public z2.q f5940n;

    /* renamed from: o, reason: collision with root package name */
    public z2.q f5941o;

    /* renamed from: p, reason: collision with root package name */
    public int f5942p;
    public final /* synthetic */ Context q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Uri f5943r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P f5944s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Context context, Uri uri, P p3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.q = context;
        this.f5943r = uri;
        this.f5944s = p3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((K) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new K(this.q, this.f5943r, this.f5944s, interfaceC1073d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0201 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:8:0x0019, B:14:0x0031, B:16:0x01fb, B:18:0x0201, B:29:0x022d, B:33:0x003a, B:35:0x017a, B:36:0x018b, B:38:0x0191, B:40:0x019d, B:41:0x01af, B:43:0x01b5, B:46:0x01c4, B:51:0x01c8, B:52:0x01d1, B:54:0x01d7, B:57:0x01e7, B:62:0x01eb, B:64:0x01f2, B:66:0x004e, B:68:0x0092, B:69:0x009e, B:71:0x00a4, B:73:0x00b4, B:75:0x00be, B:77:0x00c8, B:80:0x00d4, B:83:0x00e2, B:85:0x00ec, B:87:0x00f6, B:89:0x0100, B:91:0x010a, B:94:0x0116, B:96:0x0134, B:101:0x0160, B:103:0x0167, B:107:0x005a, B:110:0x0069), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0191 A[Catch: Exception -> 0x001e, LOOP:1: B:36:0x018b->B:38:0x0191, LOOP_END, TryCatch #0 {Exception -> 0x001e, blocks: (B:8:0x0019, B:14:0x0031, B:16:0x01fb, B:18:0x0201, B:29:0x022d, B:33:0x003a, B:35:0x017a, B:36:0x018b, B:38:0x0191, B:40:0x019d, B:41:0x01af, B:43:0x01b5, B:46:0x01c4, B:51:0x01c8, B:52:0x01d1, B:54:0x01d7, B:57:0x01e7, B:62:0x01eb, B:64:0x01f2, B:66:0x004e, B:68:0x0092, B:69:0x009e, B:71:0x00a4, B:73:0x00b4, B:75:0x00be, B:77:0x00c8, B:80:0x00d4, B:83:0x00e2, B:85:0x00ec, B:87:0x00f6, B:89:0x0100, B:91:0x010a, B:94:0x0116, B:96:0x0134, B:101:0x0160, B:103:0x0167, B:107:0x005a, B:110:0x0069), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:8:0x0019, B:14:0x0031, B:16:0x01fb, B:18:0x0201, B:29:0x022d, B:33:0x003a, B:35:0x017a, B:36:0x018b, B:38:0x0191, B:40:0x019d, B:41:0x01af, B:43:0x01b5, B:46:0x01c4, B:51:0x01c8, B:52:0x01d1, B:54:0x01d7, B:57:0x01e7, B:62:0x01eb, B:64:0x01f2, B:66:0x004e, B:68:0x0092, B:69:0x009e, B:71:0x00a4, B:73:0x00b4, B:75:0x00be, B:77:0x00c8, B:80:0x00d4, B:83:0x00e2, B:85:0x00ec, B:87:0x00f6, B:89:0x0100, B:91:0x010a, B:94:0x0116, B:96:0x0134, B:101:0x0160, B:103:0x0167, B:107:0x005a, B:110:0x0069), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d7 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:8:0x0019, B:14:0x0031, B:16:0x01fb, B:18:0x0201, B:29:0x022d, B:33:0x003a, B:35:0x017a, B:36:0x018b, B:38:0x0191, B:40:0x019d, B:41:0x01af, B:43:0x01b5, B:46:0x01c4, B:51:0x01c8, B:52:0x01d1, B:54:0x01d7, B:57:0x01e7, B:62:0x01eb, B:64:0x01f2, B:66:0x004e, B:68:0x0092, B:69:0x009e, B:71:0x00a4, B:73:0x00b4, B:75:0x00be, B:77:0x00c8, B:80:0x00d4, B:83:0x00e2, B:85:0x00ec, B:87:0x00f6, B:89:0x0100, B:91:0x010a, B:94:0x0116, B:96:0x0134, B:101:0x0160, B:103:0x0167, B:107:0x005a, B:110:0x0069), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:8:0x0019, B:14:0x0031, B:16:0x01fb, B:18:0x0201, B:29:0x022d, B:33:0x003a, B:35:0x017a, B:36:0x018b, B:38:0x0191, B:40:0x019d, B:41:0x01af, B:43:0x01b5, B:46:0x01c4, B:51:0x01c8, B:52:0x01d1, B:54:0x01d7, B:57:0x01e7, B:62:0x01eb, B:64:0x01f2, B:66:0x004e, B:68:0x0092, B:69:0x009e, B:71:0x00a4, B:73:0x00b4, B:75:0x00be, B:77:0x00c8, B:80:0x00d4, B:83:0x00e2, B:85:0x00ec, B:87:0x00f6, B:89:0x0100, B:91:0x010a, B:94:0x0116, B:96:0x0134, B:101:0x0160, B:103:0x0167, B:107:0x005a, B:110:0x0069), top: B:2:0x000f }] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List] */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.K.p(java.lang.Object):java.lang.Object");
    }
}
