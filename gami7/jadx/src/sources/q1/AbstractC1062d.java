package q1;

import B1.t;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import o2.C0997c;

/* renamed from: q1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1062d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0997c f9754a = new C0997c(1);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f9755b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f9756c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f9757d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f9758e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9759f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f9760g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f9761h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f9762i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f9763j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(C1060b[] c1060bArr, byte[] bArr) {
        int i2 = 0;
        for (C1060b c1060b : c1060bArr) {
            i2 += ((((c1060b.f9751g * 2) + 7) & (-8)) / 8) + (c1060b.f9749e * 2) + d(c1060b.f9745a, c1060b.f9746b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1060b.f9750f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f9759f)) {
            for (C1060b c1060b2 : c1060bArr) {
                q(byteArrayOutputStream, c1060b2, d(c1060b2.f9745a, c1060b2.f9746b, bArr));
                s(byteArrayOutputStream, c1060b2);
                int[] iArr = c1060b2.f9752h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    v(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                r(byteArrayOutputStream, c1060b2);
            }
        } else {
            for (C1060b c1060b3 : c1060bArr) {
                q(byteArrayOutputStream, c1060b3, d(c1060b3.f9745a, c1060b3.f9746b, bArr));
            }
            for (C1060b c1060b4 : c1060bArr) {
                s(byteArrayOutputStream, c1060b4);
                int[] iArr2 = c1060b4.f9752h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    v(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                r(byteArrayOutputStream, c1060b4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : listFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f9761h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f9760g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
        sb.append(str2);
        return sb.toString();
    }

    public static int e(int i2, int i3, int i4) {
        if (i2 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 4) {
            return i3 + i4;
        }
        throw new IllegalStateException(t.h("Unexpected flag: ", i2));
    }

    public static void f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] g(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new IllegalStateException(t.h("Not enough bytes to read: ", i2));
            }
            i3 += read;
        }
        return bArr;
    }

    public static int[] h(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) n(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] i(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.AbstractC1062d.i(java.io.FileInputStream, int, int):byte[]");
    }

    public static C1060b[] j(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1060b[] c1060bArr) {
        byte[] bArr3 = f9762i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f9763j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int n3 = (int) n(fileInputStream, 2);
            byte[] i2 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i2);
            try {
                C1060b[] l3 = l(byteArrayInputStream, bArr2, n3, c1060bArr);
                byteArrayInputStream.close();
                return l3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f9757d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int n4 = (int) n(fileInputStream, 1);
        byte[] i3 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(i3);
        try {
            C1060b[] k3 = k(byteArrayInputStream2, n4, c1060bArr);
            byteArrayInputStream2.close();
            return k3;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C1060b[] k(ByteArrayInputStream byteArrayInputStream, int i2, C1060b[] c1060bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1060b[0];
        }
        if (i2 != c1060bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int n3 = (int) n(byteArrayInputStream, 2);
            iArr[i3] = (int) n(byteArrayInputStream, 2);
            strArr[i3] = new String(g(byteArrayInputStream, n3), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C1060b c1060b = c1060bArr[i4];
            if (!c1060b.f9746b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c1060b.f9749e = i5;
            c1060b.f9752h = h(byteArrayInputStream, i5);
        }
        return c1060bArr;
    }

    public static C1060b[] l(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C1060b[] c1060bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1060b[0];
        }
        if (i2 != c1060bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            n(byteArrayInputStream, 2);
            String str = new String(g(byteArrayInputStream, (int) n(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long n3 = n(byteArrayInputStream, 4);
            int n4 = (int) n(byteArrayInputStream, 2);
            C1060b c1060b = null;
            if (c1060bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c1060bArr.length) {
                        break;
                    }
                    if (c1060bArr[i4].f9746b.equals(substring)) {
                        c1060b = c1060bArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c1060b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1060b.f9748d = n3;
            int[] h2 = h(byteArrayInputStream, n4);
            if (Arrays.equals(bArr, f9761h)) {
                c1060b.f9749e = n4;
                c1060b.f9752h = h2;
            }
        }
        return c1060bArr;
    }

    public static C1060b[] m(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f9758e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int n3 = (int) n(fileInputStream, 1);
        byte[] i2 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i2);
        try {
            C1060b[] o3 = o(byteArrayInputStream, str, n3);
            byteArrayInputStream.close();
            return o3;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long n(InputStream inputStream, int i2) {
        byte[] g3 = g(inputStream, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j3 += (g3[i3] & 255) << (i3 * 8);
        }
        return j3;
    }

    public static C1060b[] o(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C1060b[0];
        }
        C1060b[] c1060bArr = new C1060b[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int n3 = (int) n(byteArrayInputStream, 2);
            int n4 = (int) n(byteArrayInputStream, 2);
            c1060bArr[i3] = new C1060b(str, new String(g(byteArrayInputStream, n3), StandardCharsets.UTF_8), n(byteArrayInputStream, 4), n4, (int) n(byteArrayInputStream, 4), (int) n(byteArrayInputStream, 4), new int[n4], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C1060b c1060b = c1060bArr[i4];
            int available = byteArrayInputStream.available() - c1060b.f9750f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c1060b.f9753i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) n(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int n5 = (int) n(byteArrayInputStream, 2); n5 > 0; n5--) {
                    n(byteArrayInputStream, 2);
                    int n6 = (int) n(byteArrayInputStream, 1);
                    if (n6 != 6 && n6 != 7) {
                        while (n6 > 0) {
                            n(byteArrayInputStream, 1);
                            for (int n7 = (int) n(byteArrayInputStream, 1); n7 > 0; n7--) {
                                n(byteArrayInputStream, 2);
                            }
                            n6--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1060b.f9752h = h(byteArrayInputStream, c1060b.f9749e);
            int i6 = c1060b.f9751g;
            BitSet valueOf = BitSet.valueOf(g(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = valueOf.get(e(2, i7, i6)) ? 2 : 0;
                if (valueOf.get(e(4, i7, i6))) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return c1060bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean p(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1060b[] c1060bArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f9757d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f9758e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b3 = b(c1060bArr, bArr3);
                u(byteArrayOutputStream, c1060bArr.length, 1);
                u(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                u(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = f9760g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, c1060bArr.length, 1);
                for (C1060b c1060b : c1060bArr) {
                    int size = c1060b.f9753i.size() * 4;
                    String d3 = d(c1060b.f9745a, c1060b.f9746b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d3.getBytes(charset).length);
                    v(byteArrayOutputStream, c1060b.f9752h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, c1060b.f9747c, 4);
                    byteArrayOutputStream.write(d3.getBytes(charset));
                    Iterator it = c1060b.f9753i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c1060b.f9752h) {
                        v(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f9759f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b4 = b(c1060bArr, bArr5);
                u(byteArrayOutputStream, c1060bArr.length, 1);
                u(byteArrayOutputStream, b4.length, 4);
                byte[] a4 = a(b4);
                u(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = f9761h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, c1060bArr.length);
            for (C1060b c1060b2 : c1060bArr) {
                String d4 = d(c1060b2.f9745a, c1060b2.f9746b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d4.getBytes(charset2).length);
                TreeMap treeMap = c1060b2.f9753i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, c1060b2.f9752h.length);
                u(byteArrayOutputStream, c1060b2.f9747c, 4);
                byteArrayOutputStream.write(d4.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c1060b2.f9752h) {
                    v(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, c1060bArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C1060b c1060b3 : c1060bArr) {
                u(byteArrayOutputStream2, c1060b3.f9747c, 4);
                u(byteArrayOutputStream2, c1060b3.f9748d, 4);
                u(byteArrayOutputStream2, c1060b3.f9751g, 4);
                String d5 = d(c1060b3.f9745a, c1060b3.f9746b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d5.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(d5.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C1069k c1069k = new C1069k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c1069k);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c1060bArr.length) {
                try {
                    C1060b c1060b4 = c1060bArr[i7];
                    v(byteArrayOutputStream3, i7);
                    v(byteArrayOutputStream3, c1060b4.f9749e);
                    i8 = i8 + 4 + (c1060b4.f9749e * 2);
                    int[] iArr = c1060b4.f9752h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        v(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C1069k c1069k2 = new C1069k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c1069k2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c1060bArr.length) {
                try {
                    C1060b c1060b5 = c1060bArr[i11];
                    Iterator it3 = c1060b5.f9753i.entrySet().iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        i13 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, c1060b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, c1060b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i14 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i13);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C1069k c1069k3 = new C1069k(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c1069k3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            int i15 = 4;
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i16 = 0;
            while (i16 < arrayList2.size()) {
                C1069k c1069k4 = (C1069k) arrayList2.get(i16);
                u(byteArrayOutputStream, t.b(c1069k4.f9773a), i15);
                u(byteArrayOutputStream, size2, i15);
                boolean z3 = c1069k4.f9775c;
                byte[] bArr7 = c1069k4.f9774b;
                if (z3) {
                    long length5 = bArr7.length;
                    byte[] a5 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a5);
                    u(byteArrayOutputStream, a5.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                arrayList5 = arrayList;
                i15 = 4;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C1060b c1060b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, c1060b.f9749e);
        u(byteArrayOutputStream, c1060b.f9750f, 4);
        u(byteArrayOutputStream, c1060b.f9747c, 4);
        u(byteArrayOutputStream, c1060b.f9751g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, C1060b c1060b) {
        byte[] bArr = new byte[(((c1060b.f9751g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1060b.f9753i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i2 = intValue2 & 2;
            int i3 = c1060b.f9751g;
            if (i2 != 0) {
                int e3 = e(2, intValue, i3);
                int i4 = e3 / 8;
                bArr[i4] = (byte) ((1 << (e3 % 8)) | bArr[i4]);
            }
            if ((intValue2 & 4) != 0) {
                int e4 = e(4, intValue, i3);
                int i5 = e4 / 8;
                bArr[i5] = (byte) ((1 << (e4 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, C1060b c1060b) {
        int i2 = 0;
        for (Map.Entry entry : c1060b.f9753i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i2);
                v(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01bb, code lost:
    
        if (r5 == null) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c7  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r19, java.util.concurrent.Executor r20, q1.InterfaceC1061c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.AbstractC1062d.t(android.content.Context, java.util.concurrent.Executor, q1.c, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j3, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j3 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        u(byteArrayOutputStream, i2, 2);
    }
}
